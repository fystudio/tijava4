package com.course.ch03.operators;

public class AllOps {
    void f(boolean b){}
    void boolTest(boolean x, boolean y){
        //Arithmetic operators
        //! x=x*y;
        //! x=x/y;
        //! x=x+y;
        //! x=x-y;
        //! x++;
        //! x--;
        //! x=+y;
        //! x=-y;
        //Relational and logical
        //!f(x>y)
        //!f(x>=y)
        //!f(x<y)
        //!f(x<=y)
        f(x==y);
        f(x!=y);
        f(!y);
        x=x&&y;
        x=x||y;
        //bitwise operators
        //!x=~y;
        x=x&y;
        x=x|y;
        x=x^y;
        //!x=x<<1;
        //!x=x>>1;
        //!x=x>>>1;
        //Compound assignment
        //!x+=y;
        //!x-=y;
        //!x*=y;
        //!x/=y;
        //!x%=y;
        //!x<<=1;
        //!x>>=1;
        //!x>>>=1;
        x&=y;
        x^=y;
        x|=y;
        //Casting;
        //! char c = (char)x;
        //! byte b = (byte)x;
        //! short s = (short)x;
        //! int i =(int)x;
        //! long l = (long)x;
        //! float f =(float)x;
        //! double d = (double)x;
    }

    void charTest(char x, char y){
        //Arithmetic operators
        x= (char)(x*y);
        x= (char)(x/y);
        x= (char)(x%y);
        x= (char)(x+y);
        x= (char)(x-y);
        x++;
        x--;
        x = (char)+y;
        x=(char)-y;
        //Relational and logical;
        f(x>y);
        f(x>=y);
        f(x<y);
        f(x<=y);
        f(x==y);
        f(x!=y);
        //! f(!x)
        //! f(x&&y)
        //! f(x||y)
        //Bitwise operators;
        x=(char)~y;
        x=(char)(x&y);
        x=(char)(x|y);
        x=(char)(x^y);
        x=(char)(x<<1);
        x=(char)(x>>1);
        x=(char)(x>>>1);
        //Compound assignment
        x+=y;
        x-=y;
        x*=y;
        x/=y;
        x%=y;
        x<<=1;
        x>>=1;
        x>>>=1;
        x&=y;
        x^=y;
        x|=y;
        //Casting
        //! boolean bl = (boolean)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;

    }
}
