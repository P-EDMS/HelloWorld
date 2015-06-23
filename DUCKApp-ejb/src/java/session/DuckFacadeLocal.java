package session;

import entity.Duck;
import javax.ejb.Local;

@Local
public interface DuckFacadeLocal {
    public boolean createDuck(Duck duck);
}