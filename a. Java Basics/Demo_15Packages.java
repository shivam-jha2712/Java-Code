import packagesData.CalcData; // this is used to imprt the package from inside the folder structure
import packagesData.AdvcCalcData;

// And to import all the packages available in the said folder we need to use ().*) this basically imports all the file data inside the packages folder and make a note of it if there are internal folders it won't take them into consideration while importing.
import packagesData.*;

public class Demo_15Packages {
    public static void main(String[] args) {
        CalcData obj = new CalcData();
        obj.show();

        AdvcCalcData obj1 = new AdvcCalcData();
        int n = obj1.add(15, 3);
        System.out.println(n);

    }
}
