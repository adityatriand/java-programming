/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package publiclecture;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.imgcodecs.Imgcodecs;
/**
 *
 * @author Adit
 */
public class PublicLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
//    Untuk menerangkan gambar
    public static void Contrast(String filename,String tipefile){
        try{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread(filename+"."+tipefile,Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
            Mat tujuan = new Mat(source.rows(),source.cols(),source.type());
            Imgproc.equalizeHist(source, tujuan);
            Imgcodecs.imwrite("contrast_"+filename+"."+tipefile, tujuan);
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
    
//    Deteksi tepi dengan laplace operator menggunakan filter sobel
    public static void Laplace(String filename,String tipefile){
        try{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread(filename+"."+tipefile,Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
            Mat tujuan = new Mat();
            
            Imgproc.Laplacian(source, tujuan, 5);
            Imgcodecs.imwrite("laplace_"+filename+"."+tipefile,tujuan);
            
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
    
//    tambahkan border pada gambar
    public static void Border(String filename,String tipefile){
        try{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread(filename+"."+tipefile);
            Mat tujuan = new Mat();
            
            Core.copyMakeBorder(source, tujuan, 30, 30, 30, 30, Core.BORDER_REFLECT);
            Imgcodecs.imwrite("border_"+filename+"."+tipefile,tujuan);
            
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
    
    public static void Adaptiveth(String filename,String tipefile){
        try{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread(filename+"."+tipefile, Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
            Mat tujuan = new Mat();
            
            Imgproc.adaptiveThreshold(source, tujuan, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C, Imgproc.THRESH_BINARY, 11, 12);
            Imgcodecs.imwrite("adaptiveth_"+filename+"."+tipefile,tujuan);
            
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
    
    public static void Morphellipse(String filename,String tipefile){
        try{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread(filename+"."+tipefile, Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
            Mat tujuan = new Mat();
            
            Mat kernel = Mat.ones(5, 5, CvType.CV_32F);
            
            Imgproc.morphologyEx(source, tujuan, Imgproc.MORPH_ELLIPSE, kernel);
            Imgcodecs.imwrite("morphellipse_"+filename+"."+tipefile,tujuan);
            
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
    
    public static void Dilate(String filename,String tipefile){
        try{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread(filename+"."+tipefile);
            Mat tujuan = new Mat();
            
            Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size((2*2)+1,(2*2)+1));
            
            Imgproc.dilate(source,tujuan,kernel);
            Imgcodecs.imwrite("dilate_"+filename+"."+tipefile,tujuan);
            
        }catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
    
    
}
