package javaCmndLineProgramming;
class Emp{
   int eid;
   String ename;
   Emp(int eid,String ename){
    this.eid=eid;
    this.ename=ename;
   }
}

class Mgr{
   int mid;
   String mname;

   Mgr(int mid,String mname){
    this.mid=mid;
    this.mname=mname;
    }

   void report( Emp e1){					//program to use object of 1 class into method of other class				
    System.out.println(e1.ename+" EmpID: "+e1.eid+" is "+"reporting to" +mname+" MgrId:"+mid);
   }
}

class MyDemo{
 public static void main(String s[]){

 Emp e1=new Emp(101,"ANKIT");
 Mgr m1=new Mgr(1,"HARISH SADU");
 m1.report(e1);
}
}
