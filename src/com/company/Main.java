package com.company;

class task_4
{
    public static void N(int k) throws exception1, exception2, exception3
    {
        if(k < 0) throw new exception1("x < 0");
        if(k == 0) throw new exception2("x = 0");
        if(k > 0) throw new exception3("x > 0");
    }

    public static void main(String[] args)
    {
        try
        {
            N(45);
        }
        catch(exception1 | exception2 | exception3 e)
        {
            e.printStackTrace(System.out);

        }


    }
}

class exception1 extends Exception
{
    exception1(String msg) { super(msg);}
}

class exception2 extends Exception
{
    exception2(String msg) { super(msg);}
}

class exception3 extends Exception
{
    exception3(String msg) { super(msg);}
}