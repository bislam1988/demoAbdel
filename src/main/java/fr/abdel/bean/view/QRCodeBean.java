package fr.abdel.bean.view;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import sun.misc.BASE64Encoder;

import javax.ejb.Stateless;
import java.io.*;

/**
 * Created by Abdeslem on 02/05/14.
 */
@Stateless
public class QRCodeBean implements Serializable {

    public String construireQRCode() throws WriterException, IOException {

        BASE64Encoder encode = new BASE64Encoder();
        String contenu = "a.belmokaddem@gmail.com";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // Génération brute du QRCode
        BitMatrix bitMatrix = new QRCodeWriter().encode(contenu, BarcodeFormat.QR_CODE, 100, 100);
        // Conversion en PNG
        MatrixToImageWriter.writeToStream(bitMatrix, "png", outputStream);
        // Transformation en un format exploitable pour jodreports
        // InputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        // ImageSource imageSource = new RenderedImageSource(ImageIO.read(inputStream));
        return encode.encodeBuffer(outputStream.toByteArray());
    }
}
