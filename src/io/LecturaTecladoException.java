package io;

public class LecturaTecladoException extends RuntimeException { //definir el tipo de la exception
		//queremos crear una excepcion 
		//defir que sea ant cahs o cache 

//pedimos los constructores del padre 
	public LecturaTecladoException() {
		super();
		
	}

	public LecturaTecladoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

	public LecturaTecladoException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public LecturaTecladoException(String message) {
		super(message);
		
	}

	public LecturaTecladoException(Throwable cause) {
		super(cause);
	
	} 
}
