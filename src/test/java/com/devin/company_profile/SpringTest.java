package com.devin.company_profile;

import com.devin.company_profile.entity.Index;
import com.devin.company_profile.service.IIndexService;
import com.devin.company_profile.utils.SpringUtil;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Devin on 2017/8/2.
 */
public class SpringTest extends SpringUtil {
    @Test
    public void testSpring() {
        IIndexService indexService = (IIndexService) context.getBean("indexService");
        Index index = new Index();
        index.setIndexTitle("baby");
        index.setIndexDescription("a beautiful girl!");
        index.setCreateTime(new Date());
        index.setStatus(1);
        indexService.saveEntry(index);
    }
}
