package liquibase.dbtest.h2;

import liquibase.dbtest.AbstractIntegrationTest;

public class H2IntegrationTest extends AbstractIntegrationTest {

    public H2IntegrationTest() throws Exception {
        super("h2", "jdbc:h2:mem:liquibase");
    }

    @Override
    public void testOutputChangeLog() throws Exception {
        super.testOutputChangeLog();    //To change body of overridden methods use File | Settings | File Templates.
    }
}