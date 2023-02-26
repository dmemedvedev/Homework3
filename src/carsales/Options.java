package carsales;

public enum Options {


        OPTION1("CRUISE_CONTROL"),
        OPTION2("DOOR_CLOSER"),
        OPTION3("SETTINGS_MEMORY"),
        OPTION4( "HEATED_WINDSHIELD");



        private String optionName;
        private Options (String optionName) {
            this.optionName = optionName;
        }
        public String getOptionName() {
            return optionName;
        }
    }
