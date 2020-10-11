package SAN_GOLF;

public class MemberCard {
    // attributes
    protected String MemberCode;
    protected String MemberName;
    protected Date LastDateUsed;
    protected int TotalMoneyUsed;
    boolean IsVip = false;
    VipCard ViCard;
    // constructors
    MemberCard(){
        MemberCode = "";
        MemberName = "";
        LastDateUsed = new Date(0,0,0);
        TotalMoneyUsed = 0;
    }

    MemberCard(String MemCode, String MemName, Date LastDate, int TotalMoney){
        MemberCode = MemCode;
        MemberName = MemName;
        LastDateUsed = LastDate;
        TotalMoneyUsed = TotalMoney;
    }

    boolean checkVIP(Date today){
        if(TotalMoneyUsed>500 && !IsVip){
            IsVip = true;
            ViCard = new VipCard(MemberCode,MemberName,LastDateUsed,TotalMoneyUsed,1);
            return true;
        }
        else if(IsVip){
            if(today.year>ViCard.LastDateUsed.year){
                
            }
        }
        return false;
    }

    // methods
    public void ShowAttributes(){
        if(IsVip){
            ViCard.ShowAttributes();
            return;
        }
        System.out.println("Member Code: " + MemberCode);
        System.out.println("Member Name: "+ MemberName);
        LastDateUsed.PrintDate();
        System.out.println("Total Money Used: "+ Integer.toString(TotalMoneyUsed));
    }
    public boolean getIsVip(){return IsVip;}
    public int getTotalMoneyUsed(){return TotalMoneyUsed;}
    public void setTotalMoneyUsed(int NewAmount){TotalMoneyUsed = NewAmount;}
}
