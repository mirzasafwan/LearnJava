import java.util.Scanner;

class RBI {
    protected String bank_name;
    protected String bank_uniqueId;
    protected String branch_manager;

    public void setData(String bank_name, String bank_uniqueId, String branch_manager) {
        this.bank_name = bank_name;
        this.bank_uniqueId = bank_uniqueId;
        this.branch_manager = branch_manager;
    }
}

class AxisBank extends RBI {
    String getBankName() {
        return bank_name;
    }

    String getBankUniqueId() {
        return bank_uniqueId;
    }

    String getBranchManagerName() {
        return branch_manager;
    }
}

class TestBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE BANK NAME");
        String bank_name = sc.nextLine();
        System.out.println("ENTER THE BANK ID");
        String bank_uniqueId = sc.nextLine();
        System.out.println("ENTER THE MANAGER NAME");
        String branch_manager = sc.nextLine();
        AxisBank r = new AxisBank();
        if (r.getBankName() != null && r.getBankUniqueId() != null && r.getBranchManagerName() != null) {
            r.setData(bank_name, bank_uniqueId, branch_manager);
            System.out.println("*****DETAILS ARE GIVEN BELOW OF BANK******");
            System.out.println(r.getBankName());
            System.out.println(r.getBankUniqueId());
            System.out.println(r.getBranchManagerName());
        }

    }
}