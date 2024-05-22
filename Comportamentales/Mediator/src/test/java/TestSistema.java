import com.mediator.Coche;
import com.mediator.MediatorImpl;
import com.mediator.Radio;
import com.mediator.Telefono;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestSistema {
    private Radio radio;
	private Telefono telefono;
	private Coche coche;
	private MediatorImpl mediator;
	
	@Before
	public void init() {
		mediator = new MediatorImpl();
		radio = new Radio(mediator);
		telefono = new Telefono(mediator);
		coche = new Coche(mediator);

		mediator.setRadio(radio);
		mediator.setTelefono(telefono);
		mediator.setCoche(coche);
	}
	
	@Test
	public void test_encender_apagar_coche() {
		assertFalse(radio.encendida());
		assertFalse(telefono.musicaEncendida());
		
		telefono.enciendeMusica();
		assertTrue(telefono.musicaEncendida());
		
		coche.enciende();
		
		assertTrue(radio.encendida());
		assertFalse(telefono.musicaEncendida());
	
		coche.apaga();
		assertFalse(radio.encendida());
	}

	@Test
	public void test_suena_telefono() {
		radio.enciende();
		assertTrue(radio.encendida());
		
		telefono.recibeLlamada();
		
		assertFalse(radio.encendida());
	}
	
	@Test
	public void test_enciende_radio() {
		
		telefono.enciendeMusica();
		assertTrue(telefono.musicaEncendida());
		
		radio.enciende();
		
		assertFalse(telefono.musicaEncendida());
	}
}
