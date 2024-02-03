parImpar :: Int -> Int
parImpar a = if mod a 2 == 0 then 0 else 1

main :: IO ()
main = do
    putStrLn "Digite o número para verificar se é par ou ímpar: "
    a <- readLn
    if parImpar a == 0
        then putStrLn $ "O número " ++ show a ++ " é par"
        else putStrLn $ "O número " ++ show a ++ " é ímpar"
