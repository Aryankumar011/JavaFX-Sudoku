import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

public class Text_PR_02 extends Application {

    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        webView.getEngine().loadContent(
                "<html><head>" +
                        "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/monaco-editor/0.28.2/min/vs/loader.js\"></script>" +
                        "<style>body { margin: 0; padding: 0; overflow: hidden; }</style>" +
                        "</head><body>" +
                        "<div id=\"container\" style=\"width: 100%; height: 100%;\"></div>" +
                        "<script>" +
                        "require.config({ paths: { 'vs': 'https://cdnjs.cloudflare.com/ajax/libs/monaco-editor/0.28.2/min/vs' }});" +
                        "require(['vs/editor/editor.main'], function() {" +
                        "   var editor = monaco.editor.create(document.getElementById('container'), {" +
                        "       value: 'Hello, World!',\n" +
                        "       language: 'plaintext'\n" +
                        "   });" +
                        "   editor.setSelections([" +
                        "       { startLineNumber: 1, startColumn: 1, endLineNumber: 1, endColumn: 1 }," +
                        "       { startLineNumber: 2, startColumn: 2, endLineNumber: 2, endColumn: 2 }" +
                        "   ]);" +
                        "   window.onresize = function() {" +
                        "       editor.layout();" +
                        "   };" +
                        "});" +
                        "</script></body></html>"
        );

        StackPane root = new StackPane(webView);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
