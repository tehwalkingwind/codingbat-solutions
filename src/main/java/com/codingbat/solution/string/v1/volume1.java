package com.codingbat.solution.string.v1;

public class volume1 {
    public String helloName(String name) {
        return "Hello "+name+"!";
    }

    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length()-2,str.length());
        return end+end+end;
    }

    public String firstTwo(String str) {
        if (str.length()>1) return str.substring(0,2);
        else return str;
    }

    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public String comboString(String a, String b) {
        if (a.length()>b.length()) return b+a+b;
        else return a+b+a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1,a.length())+b.substring(1,b.length());
    }

    public String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }

    public String right2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }

    public String theEnd(String str, boolean front) {
        String ret = "";
        if (front) return ret+=str.charAt(0);
        else return ret+=str.charAt(str.length()-1);
    }

    public String withouEnd2(String str) {
        if (str.length()>2) return str.substring(1, str.length()-1);
        else return "";
    }

    public String middleTwo(String str) {
        int num = str.length()/2;
        return str.substring(num-1,num+1);
    }

    public boolean endsLy(String str) {
        if (str.length()>1) return (str.substring(str.length()-2, str.length()).equals("ly"));
        else return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }

    public String twoChar(String str, int index) {
        int len = str.length();
        if (len-index<2||index<0) return str.substring(0,2);
        else return str.substring(index,index+2);
    }

    public String middleThree(String str) {
        int start = ((str.length()-1)/2)-1;
        return str.substring(start,start+3);
    }

    public boolean hasBad(String str) {
        if (str.length()<3) return false;
        if (str.length()<4) return (str.substring(0,3).equals("bad"));
        else return (str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad"));
    }

    public String atFirst(String str) {
        if (str.length()>1) return str.substring(0,2);
        else if (str.length()>0) return str+"@";
        else return "@@";
    }

    public String lastChars(String a, String b) {
        if (a.length()>0) a = a.substring(0,1);
        else a = "@";
        if (b.length()>0) b = b.substring(b.length()-1);
        else b = "@";
        return a+b;
    }

    public String conCat(String a, String b) {
        String ret = "";
        if (a!=ret&&b!=ret) {
            if (a.charAt(a.length()-1)==b.charAt(0)) b = b.substring(1);
        }
        ret = a+b;

        return ret;
    }

    public String lastTwo(String str) {
        int len = str.length();
        if (len>1) {
            String word = str.substring(0,len-2);
            return word+str.charAt(len-1)+str.charAt(len-2);
        } else return str;
    }

    public String seeColor(String str) {
        int len = str.length();
        String r = "red";
        String b = "blue";
        if (len>2&&str.substring(0,3).equals(r)) return r;
        if (len>3&&str.substring(0,4).equals(b)) return b;
        return "";
    }

    public boolean frontAgain(String str) {
        int len = str.length();
        return (len>1&&str.substring(0,2).equals(str.substring(len-2,len)));
    }

    public String minCat(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        if (alen>blen) a = a.substring(alen-blen);
        else b = b.substring(blen-alen);
        return a+b;
    }

    public String extraFront(String str) {
        if (str.length()>2) str = str.substring(0,2);
        return str+str+str;
    }

    public String without2(String str) {
        if (str.length()>1&&str.substring(0,2).equals(str.substring(str.length()-2))) return str.substring(2);
        return str;
    }

    public String deFront(String str) {
        String ret = str.substring(2);
        int len = str.length();
        if (len>1&&str.charAt(1)=='b') ret = 'b'+ret;
        if (len>0&&str.charAt(0)=='a') ret = 'a'+ret;
        return ret;
    }

    public String startWord(String str, String word) {
        int wlen = word.length();
        int slen = str.length();
        if (wlen>slen) return "";
        if (wlen>1) {
            if (word.substring(1).equals(str.substring(1,wlen))) return str.substring(0,wlen);
            else return "";
        } else if (wlen>0) return str.substring(0,1);
        else return "";
    }

    public String withoutX(String str) {
        if (str.equals("")) return "";
        if (str.charAt(0)=='x') str = str.substring(1);
        if (str.length()>0&&str.charAt(str.length()-1)=='x') str = str.substring(0,str.length()-1);
        return str;
    }

    public String withoutX2(String str) {
        if (str.length()>1&&str.charAt(1)=='x') str = str.substring(0,1)+str.substring(2);
        if (str.length()>0&&str.charAt(0)=='x') str = str.substring(1);
        return str;
    }
}
