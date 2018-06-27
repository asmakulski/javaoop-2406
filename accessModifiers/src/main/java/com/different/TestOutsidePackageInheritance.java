
package com.different;

import com.infoshare.PublicClass;

public class TestOutsidePackageInheritance extends PublicClass {

    @Override
    public void publicMeth() {}

    @Override
    public void protectedMeth() {}

    //compiler error: Method does not override method from its superclass
    @Override
    public void defaultMeth() {}

    //compiler error: Method does not override method from its superclass
    @Override
    public void privateMeth() {}

    public void calling() {
        super.publicMeth();
        super.protectedMeth();
        super.defaultMeth();
        super.privateMeth();
    }

}
