package th.ac.npru.se.rn;

public class GetPlanFactory {

    // ใช้เมธอดนี้เพื่อสร้างออบเจกต์ของ Plan ตามชื่อแผนที่รับเข้ามา
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DP")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("CP")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("IP")) {
            return new InstitutionalPlan();
        } else if (planType.equalsIgnoreCase("SP")) {
            return new StudentPlan();
        }

        return null; // กรณีไม่ตรงกับประเภทใดเลย
    }

} // end of GetPlanFactory class
