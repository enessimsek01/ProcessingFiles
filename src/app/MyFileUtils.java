package app;

import com.enes.exceptions.FooRunTimeException;

public class MyFileUtils {

    public int subtract10FromLargeNumber(int number) throws /*Exception*/ FooRunTimeException { //Burasi javanin kendi exception iydi. Biz kendi exception umuzu yazabilirz.

        if(number<10)
        {
            throw new /*Exception*/ FooRunTimeException("The number passed was smaller than 10");
        }

        return number-10;
    }


}

