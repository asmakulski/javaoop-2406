package com.infoshare;


public class TestInsidePackageAccess
{

    DefaultClass defaultClass = new DefaultClass();
    PublicClass publicClass = new PublicClass();

    public void testy() {
        defaultClass.publicMeth();
        defaultClass.protectedMeth();
        defaultClass.defaultMeth();
        //defaultClass.privateMeth();   compiler error

        publicClass.publicMeth();
        publicClass.protectedMeth();
        publicClass.defaultMeth();
        //publicClass.privateMeth();  compiler error
    }


}
