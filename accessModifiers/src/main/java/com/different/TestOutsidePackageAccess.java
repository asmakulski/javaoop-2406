
package com.different;

//compiler error:  Cannot be accessed from outside package
import com.infoshare.DefaultClass;

import com.infoshare.PublicClass;


public class TestOutsidePackageAccess {

    DefaultClass defaultClass = new DefaultClass();
    PublicClass publicClass = new PublicClass();

    public void testy() {
        /*defaultClass.publicMeth();
        defaultClass.protectedMeth();
        defaultClass.defaultMeth();
        defaultClass.privateMeth(); */

        publicClass.publicMeth();
        publicClass.protectedMeth();
        publicClass.defaultMeth();
        publicClass.privateMeth();
    }
}
