package MyApplication;

public class ChatImageService {
    private byte[] ReadImage(String imagePath){
        System.out.println("Reading Image from: " + imagePath);
        return new byte[]{};
    }

    private byte[] ScanForVirus(byte[] image){
        System.out.println("Scanning for Virus");
        return image;
    }

    private byte[] ToSquareImage(byte[] image){
        System.out.println("Converting Image to Square");
        return image;
    }

    private byte[] CompressImage(byte[] image){
        System.out.println("Compressing Image");
        return image;
    }

    private void SendImage(byte[] image, String receiver){
        System.out.println("Sending Image to: " + receiver);
    }

    public void ProcessImage(String imagePath, String receiver){
        byte[] image = ReadImage(imagePath);
        image = ScanForVirus(image);
        image = ToSquareImage(image);
        image = CompressImage(image);
        SendImage(image, receiver);
    }

}
