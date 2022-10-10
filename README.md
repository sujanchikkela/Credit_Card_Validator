![developed-by-sujan-rao-chikkela](https://user-images.githubusercontent.com/27505090/205564012-17236aea-2a8c-41ae-ab1e-7969bbb9e351.svg)

# CMPE-202 Individual Project
## Sujan Rao Chikkela - 015961062


## Usage

### CSV
```
✗ java -cp sujan-cmpe-202.jar com.sujan.Main src/main/resources/input.csv output/output.csv
Output successfully written to output.csv
```
```
✗ cat output.csv
CardNumber,CardType
5567894523129089,MasterCard
59012345678901234567890,"Invalid: more than 19 digits"
4123456789123,Visa
347856341908126,AmericanExpress
6011111100007756,Discover
3601112345678789,"Invalid: not a possible card number"
5167894523129089,MasterCard
4123456789123999,Visa
377856341908126,AmericanExpress
5367894523129089,MasterCard
"6011*890HJrt6789","Invalid: non numeric characters"
,"Invalid: empty/null card number"

```


### JSON
```
✗ java -cp sujan-cmpe-202.jar com.sujan.Main src/main/resources/input.json output/output.json
Output successfully written to output.json
```
```
✗ cat output.json
{
  "cards": [
    {
      "cardType": "MasterCard",
      "cardNumber": "5567894523129089"
    },
    {
      "cardType": "Invalid: more than 19 digits",
      "cardNumber": "59012345678901234567890"
    },
    {
      "cardType": "Visa",
      "cardNumber": "4123456789123"
    },
    {
      "cardType": "AmericanExpress",
      "cardNumber": "347856341908126"
    },
    {
      "cardType": "Discover",
      "cardNumber": "6011111100007756"
    },
    {
      "cardType": "Invalid: not a possible card number",
      "cardNumber": "3601112345678789"
    },
    {
      "cardType": "MasterCard",
      "cardNumber": "5167894523129089"
    },
    {
      "cardType": "Visa",
      "cardNumber": "4123456789123999"
    },
    {
      "cardType": "AmericanExpress",
      "cardNumber": "377856341908126"
    },
    {
      "cardType": "MasterCard",
      "cardNumber": "5367894523129089"
    },
    {
      "cardType": "Invalid: non numeric characters",
      "cardNumber": "6011*890HJrt6789"
    },
    {
      "cardType": "Invalid: empty/null card number",
      "cardNumber": ""
    }
  ]
}
```

### XML
```
✗ java -cp sujan-cmpe-202.jar com.sujan.Main src/main/resources/input.xml output/output.xml
Output successfully written to output.xml
```
```
<ArrayList>
  <item>
    <CardNumber>5567894523129089</CardNumber>
    <CardType>MasterCard</CardType>
  </item>
  <item>
    <CardNumber>59012345678901234567890</CardNumber>
    <CardType>Invalid: more than 19 digits</CardType>
  </item>
  <item>
    <CardNumber>4123456789123</CardNumber>
    <CardType>Visa</CardType>
  </item>
  <item>
    <CardNumber>347856341908126</CardNumber>
    <CardType>AmericanExpress</CardType>
  </item>
  <item>
    <CardNumber>6011111100007756</CardNumber>
    <CardType>Discover</CardType>
  </item>
  <item>
    <CardNumber>3601112345678789</CardNumber>
    <CardType>Invalid: not a possible card number</CardType>
  </item>
  <item>
    <CardNumber>5167894523129089</CardNumber>
    <CardType>MasterCard</CardType>
  </item>
  <item>
    <CardNumber>4123456789123999</CardNumber>
    <CardType>Visa</CardType>
  </item>
  <item>
    <CardNumber>377856341908126</CardNumber>
    <CardType>AmericanExpress</CardType>
  </item>
  <item>
    <CardNumber>5367894523129089</CardNumber>
    <CardType>MasterCard</CardType>
  </item>
  <item>
    <CardNumber>6011*890HJrt6789</CardNumber>
    <CardType>Invalid: non numeric characters</CardType>
  </item>
  <item>
    <CardNumber></CardNumber>
    <CardType>Invalid: empty/null card number</CardType>
  </item>
</ArrayList>
```

## Validations
### Validation that required number of arguments are passed
```
✗ java -cp sujan-cmpe-202.jar com.sujan.Main
Invalid syntax. Usage: java com.sujan.Main <input file path> <output file path>
```

### Validation that input and output file extensions are same
```
✗ java -cp sujan-cmpe-202.jar com.sujan.Main src/main/resources/input.csv output/output.xml
Exception in thread "main" java.lang.RuntimeException: Input and output extensions should be the same
```
### Validation that input file path exists
```
✗ java -cp sujan-cmpe-202.jar com.sujan.Main input.csv output/output.csv
Exception in thread "main" java.lang.RuntimeException: Input path does not exist
```

## Steps to run the code

* Make sure that each Maven dependencies are included in POM.xml file.
* Go to the project structure in the File Menu and create Artifacts for the module.
* After that, Build artifacts through which .jar files are generated.
* Move the .jar file to the main folder and execute the steps mentioned.


