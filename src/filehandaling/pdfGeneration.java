package filehandaling;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class pdfGeneration {
    public static void main(String[] args) {


        try {
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Text.pdf"));
            } catch (DocumentException ex) {
                throw new RuntimeException(ex);
            }
            document.open();
            // Left
            Paragraph paragraph = new Paragraph("This is right aligned text");
            paragraph.setAlignment(Element.ALIGN_RIGHT);
            try {
                document.add(paragraph);
            } catch (DocumentException ex) {
                throw new RuntimeException(ex);
            }

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

