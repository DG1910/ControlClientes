
package pe.com.cibertec.servicio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cibertec.Dao.PersonaDao;
import pe.com.cibertec.domain.Persona;


@Service
public class PersonaServiceImpl implements PersonaService {

    
    @Autowired
    private PersonaDao personaDao;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return   (List<Persona>) personaDao.findAll();
        
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
       personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
       personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
       return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
