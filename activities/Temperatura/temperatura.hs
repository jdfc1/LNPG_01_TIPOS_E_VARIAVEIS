main :: IO ()

main = do

    putStrLn "Digite a temperatura em graus Celsius para conversão em Fahrenheit: "

    input <- getLine

    let celsius = read input :: Float
        fahrenheit = (celsius * 1.8) + 32

    putStrLn $ show celsius ++ "º Celsius é igual a " ++ show fahrenheit ++ "º em Graus Fahrenheit"
