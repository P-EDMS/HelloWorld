package session;

import entity.Duck;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DuckFacade implements DuckFacadeLocal {
    @PersistenceContext(unitName = "DUCKApp-ejbPU")
    private EntityManager em;
    
    public boolean createDuck(Duck duck) {
        try {
            em.persist(duck);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean getDuck(int did) {
        return false;
    }
    
    public boolean updateDuck(Duck duck) {
        return false;
    }
    
    public boolean deleteDuck(Duck duck) {
        return false;
    }
    
    public List<Duck> listDuck() {
        return null;
    }
    
    public List<Duck> searchDuckbyName(String name) {
        return null;
    }
}