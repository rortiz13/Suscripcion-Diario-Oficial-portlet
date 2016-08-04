package la.netco.suscripcion.service.impl;

import la.netco.generated.model.NoSuchSuscripcionException;
import la.netco.generated.model.model.Suscripcion;
import la.netco.generated.model.service.SuscripcionLocalServiceUtil;
import la.netco.suscripcion.dto.SuscripcionTO;
import la.netco.suscripcion.exceptions.PersistenceException;
import la.netco.suscripcion.service.SuscripcionService;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liferay.portal.kernel.exception.SystemException;

@Service("suscripcionService")
public class SuscripcionServiceImpl implements SuscripcionService {

	@Autowired
	private Mapper mapper;

	public SuscripcionTO guardarSuscripcion(SuscripcionTO suscripcionTO) throws PersistenceException {
		try {
			Suscripcion suscripcion = SuscripcionLocalServiceUtil.createSuscripcion(0);
			mapper.map(suscripcionTO,suscripcion );
			suscripcion = SuscripcionLocalServiceUtil.addSuscripcion(suscripcion);
			suscripcionTO = mapper.map(suscripcion, SuscripcionTO.class);
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		
		return suscripcionTO;
	}
	
	public boolean existeSuscripcionDocumento(String numDocumento){
		try{
			Suscripcion suscripcion = SuscripcionLocalServiceUtil.findBydepartamento(numDocumento);
			if(suscripcion != null)
				return true;
			
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (NoSuchSuscripcionException e) {
			return false;
		}
		
		return false;
	}


}
