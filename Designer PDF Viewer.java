//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem



    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    
    int max=0;
    int n=word.length();
    for(int i=0;i<n;i++){
        
        max=Math.max(max, h.get(word.charAt(i)-'a'));
    }

    return max*n;
    }
