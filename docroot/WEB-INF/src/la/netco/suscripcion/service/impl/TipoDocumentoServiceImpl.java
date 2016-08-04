package la.netco.suscripcion.service.impl;

import java.util.ArrayList;
import java.util.List;

import la.netco.generated.model.model.TipoDocumento;
import la.netco.generated.model.service.TipoDocumentoLocalServiceUtil;
import la.netco.suscripcion.dto.TipoDocumentoTO;
import la.netco.suscripcion.exceptions.PersistenceException;
import la.netco.suscripcion.service.TipoDocumentoService;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@Service("tipoDocumentoService")
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

	@Autowired
	private Mapper mapper;

	public List<TipoDocumentoTO> obtenerTipoDocumentos() throws PersistenceException {
		List<TipoDocumento> tipos;
		List<TipoDocumentoTO> resourceList = new ArrayList<TipoDocumentoTO>();
		try {
			tipos = TipoDocumentoLocalServiceUtil.getTipoDocumentos(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (TipoDocumento tipo : tipos) {
				resourceList.add(mapper.map(tipo, TipoDocumentoTO.class));
			}
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return resourceList;
	}

	public TipoDocumentoTO obtenerTipoDocumento(int id_tipo_doc) throws PersistenceException {
		TipoDocumentoTO tipoTO = null;
		try {
			TipoDocumento tipo = TipoDocumentoLocalServiceUtil.getTipoDocumento(id_tipo_doc);
			tipoTO =  mapper.map(tipo, TipoDocumentoTO.class);
		} catch (SystemException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		} catch (PortalException e) {
			e.printStackTrace();
			throw new PersistenceException(e.getMessage(), e.getCause());
		}
		return tipoTO;

	}
}
