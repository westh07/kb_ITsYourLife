package advanced.ch07.exam_http;

public class FileDownloadServlet extends HttpServlet{
    @Override
    public void service() {
        System.out.println("파일 다운로드 합니다.");
    }
}
