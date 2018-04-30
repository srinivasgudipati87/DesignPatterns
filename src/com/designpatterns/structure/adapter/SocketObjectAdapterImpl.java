package com.designpatterns.structure.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
	
	private Socket sock = new Socket();
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(sock.getVolt(),10);
	}

	public Volt convertVolt(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v= sock.getVolt();
		return convertVolt(v,40);
	}

}
