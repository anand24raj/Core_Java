/*In a file-sharing application, different components upload files to a server.
To enforce a common upload behavior, an interface is used.
In Java, all interface methods are implicitly public and abstract, even if the keywords are not written.

Question

Create an interface Uploader with two methods (uploadFile(),uploadImage()):
One method declared using the abstract keyword
One method declared without the abstract keyword

Show that both methods are abstract by default, and explain why explicitly writing abstract is optional.
Switch Case Logic
Case 1 → Upload File
Case 2 → Upload Image
Default → Invalid choice  */

package com.nit.interfaces;

interface Uploader
{
    public abstract void uploadFile();
    void uploadImage();
}

class FileUploader implements Uploader
{
    public void uploadFile()
    {
        IO.println("File uploaded successfully.");
    }
    public void uploadImage()
    {
        IO.println("Image uploaded successfully.");
    }
}

public class FileSharingApp
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(IO.readln());

        Uploader uploader = new FileUploader();

        switch(x)
        {
            case 1 -> uploader.uploadFile();
            case 2 -> uploader.uploadImage();
            default -> IO.println("Invalid Choice. Please select 1 or 2.");
        }
    }
}



