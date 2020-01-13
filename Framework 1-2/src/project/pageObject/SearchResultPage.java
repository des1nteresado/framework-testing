package project.pageObject;


import framework.elements.Label;
import framework.utils.RegExpUtils;
import org.openqa.selenium.By;

public class SearchResultPage{

    public Label searchResult = new Label(By.xpath("//div[@class='search_results_top']"), "searchResult");
    public Label countResult = new Label(By.xpath("//span[@class='search_results_topText']"), "countResult");

//span[@class='search_results_topText']
    public String getCountSearchResult() {
        return RegExpUtils.getCountResult(countResult.getText());
    }
}
