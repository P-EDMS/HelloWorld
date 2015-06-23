package entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-23T10:55:46")
@StaticMetamodel(Duck.class)
public class Duck_ { 

    public static volatile SingularAttribute<Duck, Boolean> dmale;
    public static volatile SingularAttribute<Duck, String> dname;
    public static volatile SingularAttribute<Duck, BigDecimal> dweight;
    public static volatile SingularAttribute<Duck, Date> ddob;
    public static volatile SingularAttribute<Duck, String> dcolour;
    public static volatile SingularAttribute<Duck, Integer> did;

}