public class SocketAdapterClass extends Socket implements SocketAdapter{
     
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get3Volt() {
        return convert(getVolt(), 40);
    }

    @Override
    public Volt get12Volt() {
        return convert(getVolt(), 10);
    }

    private Volt convert(Volt volt, int i) {
        return new Volt(volt.getVolts()/i);
    }
}
