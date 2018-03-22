package punkt.rosy.wysokosc.servis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import punkt.rosy.wysokosc.oblicz.Oblicz;
@Service
public class ServisImpl implements Servis{
	
	@Autowired
	Oblicz oblicz;
	public ServisImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Servis() {
		
		return oblicz.oblicz();
	}
	
}
