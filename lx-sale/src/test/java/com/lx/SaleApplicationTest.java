package com.lx;

import static org.junit.Assert.assertTrue;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;
import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;
import com.spire.pdf.graphics.PdfGraphicsUnit;
import com.spire.pdf.graphics.PdfImage;
import com.spire.pdf.graphics.PdfUnitConvertor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Unit test for simple App.
 */
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class SaleApplicationTest
{
    /**
     * Rigorous Test :-)
     */
//    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
        assertTrue( true );
        // 测试有问题，书签获取不到
//        DocxUtils.docxAddImage("D:\\三一与重庆建工合同.docx","D:\\1.gif");
    }

    public static void main(String[] args) {
        File inputWord = new File("D:/三一与重庆建工合同.docx");
        File outputFile = new File("D:/2.pdf");
        try  {
            InputStream docxInputStream = new FileInputStream(inputWord);
            OutputStream outputStream = new FileOutputStream(outputFile);
            IConverter converter = LocalConverter.builder().build();
            converter.convert(docxInputStream).as(DocumentType.DOCX).to(outputStream).as(DocumentType.PDF).execute();
            outputStream.close();
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main2(String[] args) throws IOException {
        //加载测试文档
        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile("D:\\ER关系（简版）.pdf");

        //获取分割后的印章图片
        BufferedImage[] images = GetImage(pdf.getPages().getCount());
        float x = 0;
        float y = 0;

        //实例化PdfUnitConvertor类
        PdfUnitConvertor convert = new PdfUnitConvertor();
        PdfPageBase pageBase;
        //将图片绘制到PDF页面上的指定位置
        for (int i = 0; i < pdf.getPages().getCount(); i++)
        {
            BufferedImage image= images[ i ];
            pageBase = pdf.getPages().get(i);
            x = (float)pageBase.getSize().getWidth() - convert.convertUnits(image.getWidth(), PdfGraphicsUnit.Point, PdfGraphicsUnit.Pixel) + 40;
            y = (float) pageBase.getSize().getHeight()/ 2;
            pageBase.getCanvas().drawImage(PdfImage.fromImage(image), new Point2D.Float(x, y));
        }

        //保存PDF文档
        pdf.saveToFile("D:\\Result.pdf");
    }

    //定义GetImage方法，根据PDF页数分割印章图片
    static BufferedImage[] GetImage(int num) throws IOException {
        String originalImg = "D:\\1.png";
        BufferedImage image = ImageIO.read(new File(originalImg));
        int rows = 1;
        int cols = num;
        int chunks = rows * cols;
        int chunkWidth = image.getWidth() / cols;
        int chunkHeight = image.getHeight() / rows;
        int count = 0;
        BufferedImage[] imgs = new BufferedImage[ chunks ];
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                imgs[ count ] = new BufferedImage(chunkWidth, chunkHeight, image.getType());
                Graphics2D gr = imgs[ count++ ].createGraphics();
                gr.drawImage(image, 0, 0, chunkWidth, chunkHeight,
                        chunkWidth * y, chunkHeight * x,
                        chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, Color.WHITE,null);
                gr.dispose();
            }
        }
        return imgs;
    }

}
