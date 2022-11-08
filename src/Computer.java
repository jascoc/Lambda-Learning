public class Computer {

    private String requiredAttribute;
    private String optionalAttribute;

    private Computer (ComputerBuilder builder) {
        this.requiredAttribute = builder.getRequiredAttribute();
        this.optionalAttribute = builder.getOptionalAttribute();
    }

    public static class ComputerBuilder {

        private String requiredAttribute;
        private String optionalAttribute;

        public String getRequiredAttribute() {
            return requiredAttribute;
        }

        public String getOptionalAttribute() {
            return optionalAttribute;
        }

        //return THIS, so it can be set multiple times!!!!
        public ComputerBuilder setOptionalAttribute(String optionalAttribute) {
            this.optionalAttribute = optionalAttribute;
            return this;
        }

        public ComputerBuilder(String requiredAttribute) {
            this.requiredAttribute = requiredAttribute;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
