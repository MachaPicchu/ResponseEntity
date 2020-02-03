package tr.com.cbc.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tr.com.cbc.domain.Adres;
import tr.com.cbc.domain.Ogrenci;

@RestController
public class Controller {

	@PostMapping("/ogrenci")
	public ResponseEntity<Ogrenci> getOgrenci(@RequestBody Ogrenci ogrenci) {

		Adres adres = new Adres("lale", "sümbül", "Kazımkarabekir");
		ogrenci.setAdres(adres);

		return ResponseEntity.ok(ogrenci);

	}

}
