package SAN_GOLF;

public class VipCard extends MemberCard{
    // attributes
    private int YearVip;

    // constructors
    VipCard(){
        MemberCode = "";
        MemberName = "";
        LastDateUsed = new Date(0,0,0);
        TotalMoneyUsed = 0;
        YearVip = 0;
    }

    VipCard(String MemCode, String MemName, Date LastDate, int TotalMoney, int yVip){
        MemberCode = MemCode;
        MemberName = MemName;
        LastDateUsed = LastDate;
        TotalMoneyUsed = TotalMoney;
        YearVip = 0;
    }

    // methods
    public void ShowAttributes(){
        System.out.println("Member Code: " + MemberCode);
        System.out.println("Member Name: "+ MemberName);
        LastDateUsed.PrintDate();
        System.out.println("Total Money Used: "+ Integer.toString(TotalMoneyUsed));
        System.out.println("Years At VIP: " + Integer.toString(YearVip));
    }
}
