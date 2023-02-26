package carsales;

public enum CarModel {


        RIO("KIA", 2021),
        A6("AUDI", 2022),
        S80("VOLVO", 2020);

        private String brandName;
        private int issueYear;

        private CarModel(String brandName, int issueYear) {
            this.brandName = brandName;
            this.issueYear = issueYear;
        }

        public String getBrandName() {
            return brandName;
        }

        public int getIssueYear() {
            return issueYear;
        }
    }