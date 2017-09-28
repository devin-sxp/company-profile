package com.devin.company_profile;

import com.devin.company_profile.entity.Index;
import com.devin.company_profile.utils.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

/**
 * Created by Devin on 2017/8/2.
 */
public class HibernateTest extends HibernateUtil{
    @Test
    public void testHibernate() {

        Session session = (Session) sessionFactory.openSession();
        Index index = session.get(Index.class, 4L);
        System.out.println(index.getIndexTitle());
        session.close();
    }
}
