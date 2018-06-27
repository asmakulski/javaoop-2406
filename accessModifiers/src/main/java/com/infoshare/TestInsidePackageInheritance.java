package com.infoshare;


public class TestInsidePackageInheritance extends PublicClass {

    @Override
    public void publicMeth() {}

    @Override
    public void protectedMeth() {}

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
