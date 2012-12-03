package org.franca.deploymodel.dsl.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.franca.deploymodel.dsl.FDeployTestsInjectorProvider;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(FDeployTestsInjectorProvider.class)
public class ModelTests extends XtextTest {
    @BeforeClass
    public static void init() {
//		EPackage.Registry.INSTANCE.put(FrancaPackage.eNS_URI, FrancaPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(FDeployPackage.eNS_URI, FDeployPackage.eINSTANCE);
    }

    @Before
    public void before() {
        suppressSerialization();
    }


    @Test
    public void test_01_SpecEmpty() {
    	testFile("testcases/01-SpecEmpty.fdepl");
    }

// TODO: activate this
//    @Test
//    public void test_20_DefEmpty() {
//    	testFile("testcases/20-DefEmpty.fdepl", "fidl/01-EmptyInterface.fidl");
//    }

}
