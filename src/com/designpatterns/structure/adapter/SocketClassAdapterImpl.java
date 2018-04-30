package com.designpatterns.structure.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(getVolt(),10);
	}

	private Volt convertVolt(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v= getVolt();
		return convertVolt(v,40);
	}

}
