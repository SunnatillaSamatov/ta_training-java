package com.epam.training.SunnatillaSamatov.nestedclasses.arifmeticexpression;

import java.util.StringJoiner;

public class Expressions {

    public static Variable var(String name, int value) {

        return new Variable(name,value);
    }

    public static Expression val(int value) {
        Expression expression = new Expression() {
            @Override
            public int evaluate() {
                return value;
            }

            @Override
            public String toExpressionString() {
                if(value<0) return "("+value+")";
                else return Integer.toString(value);
            }
        };
        return expression;
    }

    public static Expression sum(Expression... members){
        Expression expression = new Expression() {
            @Override
            public int evaluate() {
                int sum=0;
                for (Expression member:members){
                    sum+=member.evaluate();
                }
                return sum;
            }

            @Override
            public String toExpressionString() {
                StringBuilder sb = new StringBuilder("(");
                for (Expression member:members){
                    sb.append(member.toExpressionString()).append(" + ");

                }
                int index=sb.length();
                sb.delete(index-3,index).append(")");



                return sb.toString();
            }
        };
        return expression;
    }

    public static Expression product(Expression... members){
        Expression expression = new Expression() {
            @Override
            public int evaluate() {
                int product=1;
                for (Expression member:members){
                    product*=member.evaluate();
                }
                return product;
            }

            @Override
            public String toExpressionString() {
                StringBuilder sb = new StringBuilder("(");
                for(Expression member:members){
                    sb.append(member.toExpressionString()).append(" * ");
                }
                int index=sb.length();
                sb.delete(index-3,index).append(")");

                return sb.toString();
            }
        };
        return expression;
    }

    public static Expression difference(Expression minuend, Expression subtrahend){
        Expression expression = new Expression() {
            @Override
            public int evaluate() {
                return minuend.evaluate()-subtrahend.evaluate();
            }

            @Override
            public String toExpressionString() {
                return "("+minuend.toExpressionString()+" - "+subtrahend.toExpressionString()+")";
            }
        };
        return expression;
    }

    public static Expression fraction(Expression dividend, Expression divisor){
        Expression expression =new Expression() {
            @Override
            public int evaluate() {
                return dividend.evaluate()/ divisor.evaluate();
            }

            @Override
            public String toExpressionString() {
                return "("+dividend.toExpressionString()+" / "+divisor.toExpressionString()+")";
            }
        };
        return expression;
    }

}
