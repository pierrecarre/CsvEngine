package fr.ybo.moteurcsv.factory;

import java.io.Reader;
import java.io.Writer;


public class DefaultGestionnaireCsvFactory implements GestionnaireCsvFactory {

	public AbstractLectureCsv createReaderCsv(Reader reader, char separator) {
		return new LectureOpenCsv(reader, separator);
	}

	public AbstractEcritureCsv createWriterCsv(Writer writer, char separator) {
		return new EcritureOpenCsv(writer, separator);
	}

}