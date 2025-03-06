package Executor;
import Queries.IQuery;

public class QueryExecutor {
    public void ExecuteQuery(IQuery query){
        query.Query();
    }
}
