package com.infoshare;


public class TestInsidePackageInheritanceBis extends DefaultClass {

    @Override
    public void publicMeth() {}

    @Override
    public void protectedMeth() {}

    @Override
    public void defaultMeth() {}

    //compiler error: Method does not override method from its superclass
    @Override
    public void privateMeth() {}

}
