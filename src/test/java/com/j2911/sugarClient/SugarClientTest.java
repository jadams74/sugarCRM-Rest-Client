package com.j2911.sugarClient;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jeremiah on 1/16/14.
 *
 * These are not unit tests. These are functional tests to hit the a SugarCRM server.
 */
public class SugarClientTest {
    SugarClient client;

    @Before
    public void before(){
        client = new SugarClient();
    }

    @Test
    public void loginTest()throws Exception{
        String id = client.login();
        assertNotNull(id);
        assertFalse(id.isEmpty());
    }

    @Test
    public void addLeadTest()throws Exception{
        String id = client.login();
        String result = client.addLead(id);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }
}
