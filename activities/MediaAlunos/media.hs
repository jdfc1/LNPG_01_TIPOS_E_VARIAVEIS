main :: IO ()

main = do

    putStrLn "Digite o primeiro número:"
    input1 <- getLine
    let a = read input1 :: Float

    putStrLn "Digite o segundo número:"
    input2 <- getLine
    let b = read input2 :: Float

    putStrLn "Digite o terceiro número:"
    input3 <- getLine
    let c = read input3 :: Float
    
    let m = (a + b + c) / 3.0
    
    if m >= 7
        then putStrLn "aprovado"
    else if m < 3
        then putStrLn "reprovado"
    else
        putStrLn "prova final"
