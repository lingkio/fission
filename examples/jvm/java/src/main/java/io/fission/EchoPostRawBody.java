package io.fission;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import io.fission.Context;
import io.fission.Function;

public class EchoPostRawBody implements Function {

	@Override
	public ResponseEntity<?> call(RequestEntity req, Context context) {
		return new ResponseEntity<>(req.getBody(), new HttpHeaders(), HttpStatus.OK);
	}

}

