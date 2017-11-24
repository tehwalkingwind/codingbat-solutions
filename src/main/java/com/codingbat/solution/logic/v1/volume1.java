package com.codingbat.solution.logic.v1;

public class volume1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return(cigars>39&&(cigars<61||isWeekend));
    }

    public int dateFashion(int you, int date) {
        if (you<3||date<3) return 0;
        if (you>7||date>7) return 2;
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return(temp>59&&(temp<91||(temp<101&&isSummer)));
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) speed -= 5;
        int ticket = 0;
        if (speed>60) ticket++;
        if (speed>80) ticket++;
        return ticket;
    }

    public int sortaSum(int a, int b) {
        int sum = a+b;
        if (sum>9&&sum<20) sum = 20;
        return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day==0||day==6) return "off";
            else return "10:00";
        } else {
            if (day==0||day==6) return "10:00";
            else return "7:00";
        }
    }

    public boolean love6(int a, int b) {
        int[] arr = {a, b, a+b, Math.abs(a-b)};
        for (int val: arr) {
            if (val == 6) return true;
        }
        return false;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        return (n == 1 || n == 10) || ((n > 1 & n < 10) ^ outsideMode);
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0) || ((n - 1) % 11 == 0);
    }

    public boolean more20(int n) {
        return ((n - 1) % 20 == 0) || ((n - 2) % 20 == 0);
    }

    public boolean old35(int n) {
        return (n % 5 == 0) ^ (n % 3 == 0);
    }

    public boolean less20(int n) {
        return ((n + 1) % 20 == 0) || ((n + 2) % 20 ==0);
    }

    public boolean nearTen(int num) {
        return (num % 10 < 3) || (num % 10 > 7);
    }

    public int teenSum(int a, int b) {
        return (a >= 13 && a <= 19) || (b >=13 && b <= 19)
            ? 19
            : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (isMom || !isMorning);
    }

    public int teaParty(int tea, int candy) {
        int quality = 2;
        if (!(tea / candy >= 2 || candy / tea >= 2 )) quality--;
        if (tea < 5 || candy < 5) quality = 0;
        return quality;
    }

    public String fizzString(String str) {
        String ret = "";
        if (str.charAt(0) == 'f') ret += "Fizz";
        if (str.charAt(str.length() - 1) == 'b') ret+= "Buzz";
        if (ret.equals("")) ret = str;
        return ret;
    }

    public String fizzString2(int n) {
        String ret = "" + n;
        if (n % 3 == 0) ret = "Fizz";
        if (n % 5 == 0) ret = "Buzz";
        if (n % 15 == 0) ret = "FizzBuzz";
        return ret + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (c + b == a); //kiss way
        //(a ^ b ^ c) == 0; probably the cheapest idea of solution
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (bOk || b > a) && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return (b >= a && c >= b);
        } else {
            return (b > a && c > b);
        }
    }

    public boolean lastDigit(int a, int b, int c) {
        int amod = a % 10;
        int bmod = b % 10;
        int cmod = c % 10;
        return (amod == bmod) || (bmod == cmod) || (amod == cmod);
    }

    public boolean lessBy10(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);
        return ab >= 10 || bc >= 10 || ac >= 10;
    }


    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a, b);
        else return Math.max(a, b);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int ret = die1 + die2;
        if (noDoubles && die1 == die2) ret++;
        if (ret == 13) ret = 7;
        return ret;
    }

    public int redTicket(int a, int b, int c) {
        if (a != b && a != c) return 1;
        if (a == b && b == c) {
            if (a == 2) return 10;
            return 5;
        }
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == c && b == c) return 20;
        if (a == b || b == c || a == c) return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab - bc == 10 || ab - ac == 10) return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        int a1 = a / 10;
        int a2 = a % 10;
        int b1 = b / 10;
        int b2 = b % 10;
        return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);
    }

    public int sumLimit(int a, int b) {
        return String.valueOf(a + b)
            .length()
            > String.valueOf(a)
            .length()
            ? a
            : a + b;
        // F L U E N T
    }
}
